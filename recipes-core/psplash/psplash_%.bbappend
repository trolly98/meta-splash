include customize.bb
MACHINE_PSPLASH_PKG ?= "default"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SPLASH_IMAGES_forcevariable = "file://${SPLASH_IMAGE_NAME} \
                               file://${SPLASH_IMAGE_NAME};outsuffix=${MACHINE_PSPLASH_PKG} \
                              "
SRC_URI += "file://psplash-colors.h \
	    file://psplash-bar-img.png"
	    
# TASKS
def setPsplashColors(srcdir, BACKGROUND_COLOR, TEXT_COLOR, BAR_COLOR, BAR_BACKGROUND_COLOR):
    import re
    import stat
    path = f"{srcdir}/psplash-colors.h"
    f = open(path, "r")
    psplash_colors = f.read()
    f.close()

    psplash_colors = re.sub("BACKGROUND_COLOR .*", f"BACKGROUND_COLOR {BACKGROUND_COLOR}", psplash_colors, 1)
    psplash_colors = re.sub("TEXT_COLOR .*", f"TEXT_COLOR {TEXT_COLOR}", psplash_colors, 1)
    psplash_colors = re.sub("BAR_COLOR .*", f"BAR_COLOR {BAR_COLOR}", psplash_colors, 1)
    psplash_colors = re.sub("BAR_BACKGROUND_COLOR .*", f"BAR_BACKGROUND_COLOR {BAR_BACKGROUND_COLOR}", psplash_colors, 1)

    # enable reading and writing permission
    os.chmod(path, stat.S_IRWXU | stat.S_IRWXO | stat.S_IRWXG )
    f = open(path, "w")
    f.write(psplash_colors)
    f.close()

do_configure_append () {
	cd ${S}
	cp ../psplash-colors.h ./
	# strip the -img suffix from the bar png -- we could just store the
	# file under that suffix-less name, but that would make it confusing
	# for anyone updating the assets
	cp ../psplash-bar-img.png ./psplash-bar.png
	./make-image-header.sh ./psplash-bar.png BAR
}

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                META-SPLASH                  *");
    bb.plain("*      Applying custom psplash image          *");
    bb.plain("***********************************************");    
}

addtask display_banner before do_build

do_compile_prepend() {
    bb.plain("***********************************************");
    bb.plain("*     Applying custom psplash colors          *");
    bb.plain("***********************************************");

    srcdir = d.getVar('S')
    setPsplashColors(
        srcdir,
        d.getVar('BACKGROUND_COLOR'),
        d.getVar('TEXT_COLOR'),
        d.getVar('BAR_COLOR'),
        d.getVar('BAR_BACKGROUND_COLOR')
    )
}
