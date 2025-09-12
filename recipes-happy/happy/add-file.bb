DESCRIPTION = "A recipe to add aaa.nes file to the root filesystem"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI:append = " file://90tank.nes"
SRC_URI:append = " file://hundouluo.nes"
SRC_URI:append = " file://Mesen.AppImage"

# do_install 任务：安装文件
do_install() {
    install -d ${D}/usr/share/mesen-game
    install -m 0644 ${WORKDIR}/90tank.nes ${D}/usr/share/mesen-game
    install -m 0644 ${WORKDIR}/hundouluo.nes ${D}/usr/share/mesen-game
    install -m 0755 ${WORKDIR}/Mesen.AppImage ${D}/usr/share/mesen-game
}

# 指定安装到文件系统中的文件
FILES:${PN} += "/usr/share/mesen-game/*"

ERROR_QA:remove = "already-stripped file-rdeps"
