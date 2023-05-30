SUMMARY = "A psplash customization recipe"
DESCRIPTION ="This recipe allows personalization of pshlash colors and image"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=39bba7d2cf0ba1036f2a6e2be52fe3f0"

# Logo image file name as in /files folder
SPLASH_IMAGE_NAME = "logo.png"

# Color values in R,G,B format "0x00,0x00, 0x00"
BACKGROUND_COLOR = "0xff,0xff,0xff"
TEXT_COLOR  = "0xff,0x00,0x00"
BAR_COLOR = "0x6d,0x6d,0x70"
BAR_BACKGROUND_COLOR = "0xff,0xff,0xff"

BAR_IMG_RLE_PIXEL_DATA = "((uint8*) \
  "\7\377\377\377\1\0\0\0\0\377\377\377\1\327\327\315M\236\236\233\277\200" \
  "\200\201\365nnq\377\377\0&\377\377\331\0&\377\377\4nnq\377\200\200\201" \
  "\363\235\235\232\257\327\327\317:\202\0\0\0\0\5\377\377\377\1\0\0\0\0" \
  "\333\333\333\7\261\261\253|oor\357\377\0&\377\377\337\0&\377\377\2oo" \
  "r\347\260\260\252W\203\0\0\0\0\2\263\263\256rmmp\371\377\0&\377\377\341" \
  "\0&\377\377\5mmq\336\261\261\255>\0\0\0\0\333\333\322\77ppr\341\377\0" \
  "&\377\377\343\0&\377\377\3pps\264\337\337\337\10\244\244\241\324\204" \
  "\0&\377\377\1\205\205\205\377\377\377\0\0\377\333\377\0\0\377\1\205\205" \
  "\205\377\203\0&\377\377\3mmp\366\244\244\240y\210\210\210\377\203\0&" \
  "\377\377\1\203\203\203\377\377\377\0\0\377\335\377\0\0\377\1\203\203" \
  "\203\377\203\0&\377\377\2\210\210\210\375qqs\377\203\0&\377\377\1\255" \
  "\255\251\377\377\377\0\0\377\335\377\0\0\377\1\255\255\251\377\203\0" \
  "&\377\377\1qqs\377\204\0&\377\377\377\377\0\0\377\337\377\0\0\377\210" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\1mmp\376\204" \
  "\0&\377\377\377\377\0\0\377\337\377\0\0\377\203\0&\377\377\2mmp\376q" \
  "qs\376\203\0&\377\377\1\255\255\251\377\377\377\0\0\377\335\377\0\0\377" \
  "\1\255\255\251\377\203\0&\377\377\2qqs\376\210\210\210\377\203\0&\377" \
  "\377\1\203\203\203\377\377\377\0\0\377\335\377\0\0\377\1\203\203\203" \
  "\377\203\0&\377\377\3\210\210\210\373\244\244\241\251mmp\376\203\0&\377" \
  "\377\1\205\205\205\377\377\377\0\0\377\333\377\0\0\377\1\205\205\205" \
  "\377\203\0&\377\377\4mmp\360\243\243\241\213\326\326\314\31oos\327\332" \
  "\0&\377\377\1mmp\376\202mmp\375\205mmp\374\203mmp\373\237\0&\377\377" \
  "\3mmp\374mmp\375mmp\374\203mmp\375\202mmp\376\326\0&\377\377\5qqt\254" \
  "\346\346\314\12\0\0\0\0\263\263\257Fmmp\355\356\0&\377\377\1mmp\376\215" \
  "\0&\377\377\1mmp\376\211\0&\377\377\2mmp\374mmp\375\330\0&\377\377\7" \
  "llp\326\263\263\256<\0\0\0\0\377\377\377\1\0\0\0\0\257\257\254Vppr\340" \
  "\355\0&\377\377\1mmp\375\212\0&\377\377\2mmp\375\0&\377\377\202mmp\375" \
  "\341\0&\377\377\3mmp\375oos\317\261\261\252H\202\0\0\0\0\202\377\377" \
  "\377\1\5\0\0\0\0\327\327\320&\237\237\234\237\200\200\201\363nnq\377" \
  "\327mmp\376\203\0&\377\377\203mmp\376\202\0&\377\377\212mmp\376\1\0&" \
  "\377\377\202mmp\376\227\0&\377\377\205mmp\376\203\0&\377\377\310mmp\376" \
  "\204\0&\377\377\5mmp\376nnq\377\200\200\201\357\236\236\232\230\323\323" \
  "\314#\202\0\0\0\0\1\377\377\377\1")"

# Overide MACHINE_PSPLASH_PKG name
# add you own override if misssing
#MACHINE_PSPLASH_PKG:qemuall = "default"
#MACHINE_PSPLASH_PKG:qemux86-64 = "default"
MACHINE_PSPLASH_PKG = "raspberrypi"
