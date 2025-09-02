# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/lxde/lxappearance.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.6.4+git"
SRCREV = "96e09b05b1897bdca72d8fdfeb1bd8ec68942c42"

S = "${WORKDIR}/git"

# NOTE: the following prog dependencies are unknown, ignoring: xsltproc xmlcatalog
# NOTE: unable to map the following pkg-config dependencies: "x11"
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "glib-2.0 intltool-native glib-2.0-native libx11 gtk+3"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = "--enable-gtk3"

