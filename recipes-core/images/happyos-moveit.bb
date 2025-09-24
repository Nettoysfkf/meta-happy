SUMMARY = "A very basic X11 image with a terminal"

IMAGE_FEATURES += "splash package-management x11-base"

LICENSE = "MIT"

inherit core-image features_check

REQUIRED_DISTRO_FEATURES = "x11"

IMAGE_LINGUAS = "zh-cn en-us"

happy-glibc-pkg = "glibc-dev glibc-extra-nss glibc-pcprofile glibc-utils ldconfig ldd ldso libnss-db libsotruss nscd sln tzcode localedef"

happy-glibc-locale = ""

happy-ros-core = "\
    ros-core ros-environment ros2cli \
    ros-workspace \
"

happy-ros-development = "\
    python3-colcon-ros python3-rosdep python3-vcstool \
    python3-setuptools python3-numpy \
    python3-pybind11 pybind11-vendor pybind11-json-vendor \
"

happy-ros-core-moveit = "\
    ament-cmake ament-cmake-python ament-cmake-ros \
    ament-cmake-gmock ament-cmake-gtest ament-cmake-pytest \
    actionlib-msgs \
    eigen3-cmake-module \
    libeigen launch-testing launch-testing-ament-cmake \
    fmt \
    py-binding-tools pluginlib \
    moveit moveit-msgs moveit-common \
    moveit-core moveit-ros-planning moveit-ros-planning-interface \
    moveit-task-constructor-msgs moveit-planners moveit-configs-utils \
    moveit-planners-chomp moveit-planners-ompl moveit-resources-fanuc-moveit-config \
    moveit-task-constructor-core moveit-task-constructor-demo moveit-ros-move-group \
    moveit-configs-utils moveit-resources-panda-moveit-config \
    urdf urdf-parser-plugin urdfdom-headers urdfdom \
    visualization-msgs \
    rosidl-default-runtime rosidl-default-generators rviz2 \
    rviz-marker-tools rclcpp rclcpp-action rclcpp-lifecycle rclcpp-components rclcpp-cascade-lifecycle \
    swri-roscpp std-msgs \
    geometry-msgs generate-parameter-library generate-parameter-library-py \
    tf2-eigen \
    graph-msgs \
    rviz-visual-tools \
    ament-flake8 python3-flake8 \
    zlib zlib-staticdev \
    octomap-staticdev \
    ament-pep257 python3-pydocstyle \
    moveit-ros-perception \
    libxaw7 libxaw6 libxaw-dev \
    moveit-task-constructor-visualization \
    launch-param-builder \
    moveit-visual-tools \
    moveit-tutorial \
    moveit-resources \
    srdfdom \
    controller-manager \
"

happy-ros-ament = " \
    ament-cmake-python ament-cmake-ros ament-package ament-lint ament-lint-auto ament-cmake ament-cmake-auto \
    ament-cmake-core ament-cmake-export-definitions ament-cmake-export-dependencies ament-cmake-export-include-directories \
    ament-cmake-export-interfaces ament-cmake-export-libraries ament-cmake-export-link-flags ament-cmake-export-targets \
    ament-cmake-gen-version-h ament-cmake-gmock ament-cmake-gtest ament-cmake-include-directories ament-cmake-libraries \
    ament-cmake-pytest ament-cmake-python ament-cmake-target-dependencies ament-cmake-test ament-cmake-vendor-package \
    ament-cmake-version foonathan-memory-staticdev rclcpp rclcpp-lifecycle rclcpp-action rclcpp-components builtin-interfaces \
    common-interfaces fastrtps-cmake-module rosidl-default-generators rosidl-generator-c rosidl-generator-cpp rosidl-cmake \
    ament-lint-cmake ament-xmllint \
    cppcheck ament-cmake-cppcheck ament-cppcheck python-cmake-module rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-default-generators \
"

happy-flutter = "clang"

happy-other = "packagegroup-fonts-truetype fontconfig liberation-fonts font-util xorg-minimal-fonts"

IMAGE_INSTALL:append = " \
    packagegroup-core-full-cmdline \
    packagegroup-core-ssh-openssh \
    packagegroup-core-x11 \
    ${happy-glibc-pkg} \
    ${happy-glibc-locale} \
    ${happy-ros-core} \
    ${happy-ros-core-moveit} \
    ${happy-ros-ament} \
    ${happy-ros-development} \
    ${ROS_SDK_TARGET_PACKAGES} \
    xkbcomp \
    lxdm \
    lxde-common \
    lxde-icon-theme \
    lxmenu-data \
    lxpanel \
    lxsession \
    lxterminal \
    lxappearance \
    iso-codes \
    openbox \
    xserver-xorg-extension-glx \
    xf86-video-modesetting \
    xserver-xorg-module-exa \
    xserver-xorg-module-libwfb \
    xserver-xorg-utils \
    kernel-modules \
    linux-firmware \
    librsvg-gtk \
    libegl-mesa \
    libgles1-mesa \
    libgles2-mesa \
    libgl-mesa \
    mesa-vulkan-drivers \
    mesa-megadriver \
    mesa-demos \
    htop \
    git cmake meson ninja \
    vim gedit \
    ssr \
    fceux minizip \
    qtbase qtbase-mkspecs qtbase-plugins qtbase-dev qtbase-qmlplugins qtbase-tools  qt5-opengles2-test  x11vnc \
    alsa-lib alsa-utils alsa-plugins pulseaudio \
    fuse \
    add-file \
    sudo \
    packagegroup-qt5-qtcreator-debug \
    packagegroup-qt5-toolchain-target \
    python3-pip \
    python3-setuptools \
    flatpak \
    e2fsprogs e2fsprogs-resize2fs \
    libmd \
    ntp ntp-utils \
    tzdata \
    tree \
"
inherit rockchip-image

IMAGE_INSTALL:append = " glmark2"
PACKAGECONFIG:pn-glmark2 = " \ 
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'x11-gles2', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', '', d)} \
    drm-gles2 \
"

inherit extrausers
HAPPY_PASSWD = "\$6\$happyos\$ft97yATdO0MXNg2G7UI0NO2BFQqc1FchkeXQapQb5/Q6AnkuAqv8c0RSQVKAiOYgduU9hEzgXaOcfdNPu..U.0"
EXTRA_USERS_PARAMS = "\
    useradd -p '${HAPPY_PASSWD}' -G sudo happy; \
    usermod -aG sudo happy; \
    usermod -aG input happy; \
"
