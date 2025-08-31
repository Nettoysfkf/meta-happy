# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"

SRC_URI = "git://github.com/lxde/lxde-icon-theme.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.5.2+git"
SRCREV = "3d152d3f837491b96bba081f8f3b0d6d61e3f775"

S = "${WORKDIR}/git"
B = "${S}"

DEPENDS = "intltool-native"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools-brokensep

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

FILES:${PN} += "${datadir}/icons/*"
