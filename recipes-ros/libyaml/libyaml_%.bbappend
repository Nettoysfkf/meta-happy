# for meta-ros
# fix error
#| CMake Error at **/**/tmp/work/cortexa76-cortexa55-happy-linux/ignition-fuel-tools4/4.9.1/recipe-sysroot/usr/lib/cmake/yaml/yamlTargets.cmake:75 (message):
#|   The imported target "yaml" references the file
#| 
#|      "/usr/lib/libyaml.so.0.2.5"



do_install:append:class-target() {
    sed -i 's|set(_IMPORT_PREFIX "/usr")|set(_IMPORT_PREFIX "${CMAKE_SYSROOT}/usr")|' ${D}/usr/lib/cmake/yaml/yamlTargets.cmake
}
