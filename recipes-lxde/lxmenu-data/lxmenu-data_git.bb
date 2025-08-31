# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

SRC_URI = "git://github.com/lxde/lxmenu-data.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.1.6+git"
SRCREV = "cacc20b2fe6462dd6b8458f0858a8c80f6b89421"

S = "${WORKDIR}/git"
B = "${S}"

DEPENDS = "intltool-native glib-2.0-native"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext autotools-brokensep

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""
FILES:${PN} += "${datadir}/desktop-directories/*"
