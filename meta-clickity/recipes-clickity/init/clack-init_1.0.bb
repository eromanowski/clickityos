SUMMARY = "Clickity Clack Init Services"
LICENSE = "CLOSED"

#LIC_FILES_CHKSUM

SRC_URI = "\
    file://session \
    file://clack.service \
"

S = "${WORKDIR}"

SYSTEMD_SERVICE_${PN}="clack.service"

do_install() {
        install -d ${D}/etc/mini_x

        install -m 0755 ${WORKDIR}/session ${D}/etc/mini_x/session

        install -d ${D}${systemd_system_unitdir}
        install -m 0644 ${WORKDIR}/clack.service ${D}${systemd_system_unitdir}/
}

inherit allarch systemd