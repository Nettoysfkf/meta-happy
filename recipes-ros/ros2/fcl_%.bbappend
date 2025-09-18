do_configure:prepend () {
    cp ${WORKDIR}/recipe-sysroot/opt/ros/humble/lib/pkgconfig/octomap.pc ${WORKDIR}/recipe-sysroot/usr/lib/pkgconfig/
}

