FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://0001-rviz-visual-tool-fix-warrning-as-error.patch"
CXXFLAGS += "-Wno-error=format-security"
