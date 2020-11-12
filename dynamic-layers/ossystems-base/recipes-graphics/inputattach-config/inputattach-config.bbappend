# Append path for oyster layer to include bsp inputattach.config
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://99-calibration.conf \
    "

do_install_append() {
    install -Dm 0644 ${WORKDIR}/99-calibration.conf ${D}${datadir}/X11/xorg.conf.d/99-calibration.conf
}

FILES_${PN} += "${datadir}/X11/xorg.conf.d/*.conf"
