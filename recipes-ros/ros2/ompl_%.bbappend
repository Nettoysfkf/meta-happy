SRC_URI:remove = "file://0001-FindPython.cmake-install_python-Allow-to-set-differe.patch"
EXTRA_OECMAKE:remove = "-DINSTALL_PYTHON_SHEBANG='/usr/bin/env python3'"
do_install:append() {
	sed -i 's|${RECIPE_SYSROOT}||' ${D}/opt/ros/humble/lib/pkgconfig/ompl.pc
	sed -i 's|${RECIPE_SYSROOT}||' ${D}/opt/ros/humble/share/ompl/cmake/omplConfig.cmake
}
