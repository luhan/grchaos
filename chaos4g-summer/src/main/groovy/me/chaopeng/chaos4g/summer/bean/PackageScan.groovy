package me.chaopeng.chaos4g.summer.bean

import groovy.transform.builder.Builder

/**
 * me.chaopeng.chaos4g.summer.bean.PackageScan
 *
 * @author chao
 * @version 1.0 - 2016-06-06
 */
class PackageScan {

    String packageName
    boolean recursive = true
    boolean excludeInner = false

}