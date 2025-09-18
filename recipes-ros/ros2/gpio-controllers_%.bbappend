FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-gpio_controller-fix-warning-as-error.patch"

ROS_BUILD_DEPENDS:append = " generate-parameter-library-py-native"
