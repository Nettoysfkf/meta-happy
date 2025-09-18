LICENSE = "BSD-3-Clause"
DEPENDS:append = " pkgconfig-native"

EXTRA_OECMAKE += " \
    -DCMAKE_INCLUDE_PATH=${STAGING_DIR_TARGET}/usr/lib/OGRE19 \
"
CXXFLAGS += "-I${STAGING_DIR_TARGET}/usr/include/OGRE19 -I${STAGING_DIR_TARGET}/usr/include/OGRE19/Paging -Wno-deprecated-declarations -Wno-error=format-security"

