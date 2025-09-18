FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-tmp-fix-ceres-already-build-with-suitespares.patch"
SRC_URI += "file://use-newer-abseil-api.patch"
SRC_URI:remove = "file://0002-CmakeLists.txt-set-C-version-to-C-14.patch"
EXTRA_OECMAKE += " -DCMAKE_CXX_STANDARD=17"
