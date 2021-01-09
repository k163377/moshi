package com.squareup.moshi.kotlin.reflect;

import kotlin.reflect.KFunction;

class SpreadWrapper {
  // Wrapper to avoid costly calls using spread operator.
  static <T> T call(KFunction<T> function, Object[] args) {
    return function.call(args);
  }
}
