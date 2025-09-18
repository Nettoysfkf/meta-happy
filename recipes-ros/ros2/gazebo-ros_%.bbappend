DEPENDS:append = " rosidl-adapter pkgconfig-native protobuf-c-native protobuf-c"
EXTRA_OECMAKE += " -DCMAKE_PROGRAM_PATH=${STAGING_DIR_NATIVE}/usr/bin"

inherit cmake_qt5
