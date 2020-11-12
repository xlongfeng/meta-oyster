SUMMARY = "inputattach-daemon startup scripts"
SECTION = "base"
PR = "r0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

S = "${WORKDIR}"

inherit update-rc.d systemd

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install () {
    install -d ${D}${sysconfdir}/init.d
    ln -sf /usr/bin/inputattachctl ${D}${sysconfdir}/init.d/inputattachctl
}

INITSCRIPT_NAME = "inputattachctl"
INITSCRIPT_PARAMS = "defaults 8"
