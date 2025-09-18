ROS_BUILD_DEPENDS:append = " generate-parameter-library-py-native"
ROS_BUILDTOOL_DEPENDS:append = " generate-parameter-library"
ROS_BUILDTOOL_EXPORT_DEPENDS:append = " generate-parameter-library"

DEPENDS:append = "backward-ros backward-ros-native rosidl-adapter rosidl-adapter-native"
