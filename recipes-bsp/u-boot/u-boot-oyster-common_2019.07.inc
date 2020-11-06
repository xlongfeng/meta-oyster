# Copyright (C) 2012-2019 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

inherit fsl-u-boot-localversion

LOCALVERSION = "+oyster"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

DEPENDS += "bison-native"

SRC_URI = "git://github.com/xlongfeng/u-boot-oyster.git;branch=${SRCBRANCH}"

SRCREV = "808e45b5327d49e1b3558917b914ad0c816db8ef"
SRCBRANCH = "2019.07+oyster"

PV = "v2019.07+git${SRCPV}"

S = "${WORKDIR}/git"
