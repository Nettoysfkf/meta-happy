# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   plugins/netstatus/COPYING
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=9d19a9495cc76dc96b703fb4aa157183 \
                    file://plugins/netstatus/COPYING;md5=c746ccd4faefa5cf51ad670932374939"

SRC_URI = "git://github.com/lxde/lxpanel.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.11.1+git"
SRCREV = "b90d169002d4ac9c8b24a577c8be8f2e654409a8"

S = "${WORKDIR}/git"
B = "${S}"

# NOTE: unable to map the following pkg-config dependencies: gtk+-2.0
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libx11 glib-2.0 libxml2 intltool-native alsa-lib gdk-pixbuf keybinder libwnck3 menu-cache lxmenu-data glib-2.0-native libfm libfm-extra gtk+3 curl iw libnl"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig gettext autotools-brokensep

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF += "--enable-gtk3 --with-plugins=all,-netstat"
ERROR_QA:remove = "dev-so"
