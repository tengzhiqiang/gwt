/*
 * Copyright 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.core.client.interop;

import com.google.gwt.core.client.js.JsExport;

/**
 * Test access to static field from JS through exported static method.
 */
@JsExport
public class StaticInitializerStaticMethod {
  public static StaticInitializerStaticMethod STATIC = new StaticInitializerStaticMethod();
  public static StaticInitializerStaticMethod getInstance() {
    return STATIC;
  }
}
