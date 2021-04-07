package com.java.design.patterns.patterns.singleTon;

/** Erich Gamma - (GoF Author) I am actually in favor of dropping Singleton, it's use always is a design smell.
 * MOTIVATION
 * ============
 * Sometimes, it makes sense to have only one instance of an object through out the entire
 * scope of application. That's when we use Singleton pattern. For example, Database connections, object factory
 * classes of these types seem like, instantiation once is enough.
 *
 * Sometimes, contsructor call is very expensive.Even in this case, we can explore possibility
 * of having that instance as a singleton.
 * WHAT TO DO?
 * ===========
 * 1) WE INSTANTIATE IT ONLY ONCE.
 * 2) WE PROVIDE EVERYONE WITH THE SAME INSTANCE.
 */
public class demo {
}
/*
DEFINATION
==========
A component which is instantied only once for entire application.
* CONCERNS
* =============
* 1) Want to prevent anyone else creating additional copies
* 2) Need to take care of lazy instantiation and thread safety
* */