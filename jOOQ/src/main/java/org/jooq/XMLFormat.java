/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

/**
 * An XML formatting type, which can be used to configure XML imports / exports.
 *
 * @author Lukas Eder
 */
public final class XMLFormat {

    final boolean format;
    final String  newline;
    final int     indent;

    public XMLFormat() {
        this(
            false,
            "\n",
            2
        );
    }

    private XMLFormat(
        boolean format,
        String newline,
        int indent
    ) {
        this.format = format;
        this.newline = newline;
        this.indent = indent;
    }

    /**
     * The new value for the formatting flag, defaulting to <code>false</code>.
     */
    public XMLFormat format(boolean newFormat) {
        return new XMLFormat(
            newFormat,
            newline,
            indent
        );
    }

    /**
     * The formatting flag.
     */
    public boolean format() {
        return format;
    }

    /**
     * The new newline character, defaulting to <code>\n</code>.
     */
    public XMLFormat newline(String newNewline) {
        return new XMLFormat(
            format,
            newNewline,
            indent
        );
    }

    /**
     * The formatting flag.
     */
    public String newline() {
        return newline;
    }

    /**
     * The new indentation value, defaulting to <code>2</code>.
     */
    public XMLFormat indent(int newIndent) {
        return new XMLFormat(
            format,
            newline,
            newIndent
        );
    }

    /**
     * The indentation.
     */
    public int indent() {
        return indent;
    }
}