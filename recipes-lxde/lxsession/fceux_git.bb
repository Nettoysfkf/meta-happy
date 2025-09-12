# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   src/lua/COPYRIGHT
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://fceux-server/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://getSDLKey/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://gfceu/COPYING;md5=4325afd396febcb659c36b49533135d4 \
                    file://src/lua/COPYRIGHT;md5=90c3badc6055c699194c4a7cea583296"

SRC_URI = "git://github.com/TASEmulators/fceux;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git"
SRCREV = "e550e5cc77dbac43afe20e9d1ac515cacdf11fba"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Qt6 Qt5
# NOTE: unable to map the following pkg-config dependencies: minizip x264 sdl2 (lua5.1 or lua-5.1) x265
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "virtual/libgl libarchive libx11 zlib libxkbcommon pipewire qtbase qtx11extras qttools qtchooser qttools-native qtchooser-native libxinerama x264 x265 libsdl2 minizip"

inherit cmake pkgconfig perlnative cmake_qt5 mime-xdg

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DQT=5"

