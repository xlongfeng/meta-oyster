# Copyright (C) 2020 Landon Hsiao <xlongfeng@126.com>.

inherit populate_sdk_qt5_base

TOOLCHAIN_HOST_TASK_append = " nativesdk-qttools-tools nativesdk-qtbase"
CORE_IMAGE_BASE_INSTALL_append = " qtserialport qtmultimedia"
CORE_IMAGE_BASE_INSTALL_append = " qtvirtualkeyboard qtcharts qtquickcontrols2 cinematicexperience"
