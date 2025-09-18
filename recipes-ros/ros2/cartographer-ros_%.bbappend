FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
DEPENDS:append = " rosidl-adapter"
EXTRA_OECMAKE += " -DCMAKE_CXX_STANDARD=17 -DCMAKE_POSITION_INDEPENDENT_CODE=ON"
LDFLAGS += "-labsl_log_internal_check_op -labsl_log_internal_message"

SRC_URI:remove = "file://0001-CmakeLists.txt-set-C-version-to-C-14.patch \"
SRC_URI += "file://0001-use-new-absl-api.patch \"
SRC_URI += "file://cartographer-ros-fix-undefine-_ZN4absl12lts_2024011612log_internal.patch \"
