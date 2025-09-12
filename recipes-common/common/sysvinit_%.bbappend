FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://lxdm"

do_install:append() {
    install -m 0755 ${WORKDIR}/lxdm ${D}${sysconfdir}/init.d
    update-rc.d -r ${D} lxdm defaults
}
