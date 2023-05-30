include customize.bb
MACHINE_PSPLASH_PKG ?= "default"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SPLASH_IMAGES_forcevariable = "file://${SPLASH_IMAGE_NAME} \
                               file://${SPLASH_IMAGE_NAME};outsuffix=${MACHINE_PSPLASH_PKG} \
                              "

# TASKS

def setPsplashColors(srcdir, BACKGROUND_COLOR, TEXT_COLOR, BAR_COLOR, BAR_BACKGROUND_COLOR):
    import re
    import stat
    path = f"{srcdir}/psplash-colors.h"
    bb.plain(path)
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
    
def setPsplashBar(srcdir, BAR_IMG_RLE_PIXEL_DATA):
    import re
    import stat
    path = f"{srcdir}/psplash-bar-img.h"
    bb.plain(path)
    f = open(path, "r")
    psplash_bar = f.read()
    bb.plain(psplash_bar)
    f.close()

    #psplash_bar = re.sub("BAR_IMG_RLE_PIXEL_DATA .*", f"BAR_IMG_RLE_PIXEL_DATA {BAR_IMG_RLE_PIXEL_DATA}", psplash_bar, 1)

    # enable reading and writing permission
    os.chmod(path, stat.S_IRWXU | stat.S_IRWXO | stat.S_IRWXG )
    f = open(path, "w")
    f.write(psplash-bar-img)
    f.close()

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
    bb.plain(srcdir)
    setPsplashColors(
        srcdir,
        d.getVar('BACKGROUND_COLOR'),
        d.getVar('TEXT_COLOR'),
        d.getVar('BAR_COLOR'),
        d.getVar('BAR_BACKGROUND_COLOR')
    )
    #setPsplashBar(
    #	srcdir,
    #    d.getVar('BAR_IMG_RLE_PIXEL_DATA')
    #)
}
