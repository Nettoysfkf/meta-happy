# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=597980c597fe9ce16d7b6b19c44cfced"

SRC_URI = "git://github.com/lxde/lxde-common.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.99.3+git"
SRCREV = "f38621d0bed738857e651eef6c0b3e3381f9da8b"

S = "${WORKDIR}/git"
B = "${S}"
# NOTE: the following prog dependencies are unknown, ignoring: xmlcatalog xsltproc
DEPENDS = "intltool-native glib-2.0-native glib-2.0 lxde-icon-theme lxpanel lxsession openbox pcmanfm"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext autotools-brokensep

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""
FILES:${PN} += " \
    /usr/share/xsessions/* \
    /usr/share/lxde/* \
"
