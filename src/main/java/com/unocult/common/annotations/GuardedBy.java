package com.unocult.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright (c) 2005 Brian Goetz and Tim Peierls
 * Released under the Creative Commons Attribution License
 * (http://creativecommons.org/licenses/by/2.5)
 * Official home: http://www.jcip.net
 *
 * Adopted from Java Concurrency in Practice. This annotation defines the monitor that protects the variable
 * annotated by @GuardedBy, e.g. @GuardedBy("lock") or @GuardedBy("this")
 * @author Bela Ban
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface GuardedBy {
    String value();
}
