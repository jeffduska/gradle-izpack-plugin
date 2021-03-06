/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins.izpack

/**
 * Available installer types.
 *
 * @author Benjamin Muschko
 */
enum InstallerType {
    STANDARD('standard'), WEB('web')

    static final Map INSTALLER_TYPES

    static {
        INSTALLER_TYPES = [:]

        values().each { installerType ->
            INSTALLER_TYPES.put(installerType.name, installerType)
        }
    }

    final String name

    private InstallerType(String name) {
        this.name = name
    }

    static getInstallerTypeForName(name) {
        INSTALLER_TYPES[name]
    }

    static getNames() {
        INSTALLER_TYPES.keySet()
    }
}
