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
LIC_FILES_CHKSUM = "file://COPYING;md5=a76102f7f48780284bee49e6edaeb5a9"

SRC_URI = "git://github.com/lxde/lxsession.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.5.6+git"
SRCREV = "886b9ad90f98b12c775313331431769295138f69"

S = "${WORKDIR}/git"
B = "${S}"

# NOTE: the following prog dependencies are unknown, ignoring: xmlcatalog xsltproc
# NOTE: unable to map the following pkg-config dependencies: indicator-0.4 libnotify appindicator-0.1
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libx11 glib-2.0 intltool-native glib-2.0 glib-2.0-native gtk+3 polkit vala-native dbus-glib"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext pkgconfig autotools-brokensep vala

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF += "--enable-gtk3"

