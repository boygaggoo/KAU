package ca.allanwang.kau.logging

import timber.log.Timber


/**
 * Created by Allan Wang on 2017-05-28.
 */
open class TimberLogger(tag: String) {
    internal val TAG = "$tag: %s"
    fun e(s: String) = Timber.e(TAG, s)
    fun d(s: String) = Timber.d(TAG, s)
    fun i(s: String) = Timber.i(TAG, s)
    fun v(s: String) = Timber.v(TAG, s)
}