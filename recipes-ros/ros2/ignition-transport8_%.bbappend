do_install:append () {
    sed -i 's#find_package(IgnProtobuf ${ign_package_quiet} ${ign_package_required})#find_package(IgnProtobuf 3 ${ign_package_quiet} ${ign_package_required} COMPONENTS all)#' ${D}/usr/lib/cmake/ignition-transport8/ignition-transport8-config.cmake
}

