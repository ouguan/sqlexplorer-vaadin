/**
 * Licensed to JumpMind Inc under one or more contributor
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU General Public License, version 3.0 (GPLv3)
 * (the "License"); you may not use this file except in compliance
 * with the License.
 *
 * You should have received a copy of the GNU General Public License,
 * version 3.0 (GPLv3) along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jumpmind.vaadin.ui.common;

import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.ui.PasswordField;

public abstract class ImmediateUpdatePasswordField extends PasswordField {

    private static final long serialVersionUID = 1L;

    boolean initialized = false;

    public ImmediateUpdatePasswordField(String caption) {
        super(caption);
        setImmediate(true);
        setNullRepresentation("");
        setTextChangeEventMode(TextChangeEventMode.LAZY);
        setTextChangeTimeout(200);
        addTextChangeListener(new TextChangeListener() {
            private static final long serialVersionUID = 1L;

            @Override
            public void textChange(TextChangeEvent event) {
                save(event.getText());
            }
        });
    }

    abstract protected void save(String text);
}
