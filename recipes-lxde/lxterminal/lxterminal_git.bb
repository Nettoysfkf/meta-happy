# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "git://github.com/lxde/lxterminal.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.4.1+git"
SRCREV = "ac5e36f496b2bf95eae790181e65c9eb54bb9c13"

S = "${WORKDIR}/git"
B = "${S}"

# NOTE: the following prog dependencies are unknown, ignoring: xmlcatalog xsltproc
# NOTE: unable to map the following pkg-config dependencies: vte vte-2.91
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "glib-2.0 intltool-native libx11 glib-2.0-native gtk+3 vte"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext pkgconfig autotools-brokensep

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = "--enable-gtk3"
FILES:${PN} += "/usr/share/icons/*"
