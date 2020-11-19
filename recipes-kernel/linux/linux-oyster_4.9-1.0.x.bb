# Copyright (C) 2015, 2017 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP i.MX Linux kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on NXP 4.9.11-1.0.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

require recipes-kernel/linux/linux-fslc.inc

SRC_URI = "git://github.com/xlongfeng/linux-oyster.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-oyster"

PV .= "+git${SRCPV}"

SRCBRANCH = "4.9-1.0.x-oyster"
SRCREV = "ca52d75b701c8b60a046ff2f1ac2a15c225ece10"

COMPATIBLE_MACHINE = "(mx6|mx7)"
