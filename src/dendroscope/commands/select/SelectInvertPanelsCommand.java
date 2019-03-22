/**
 * SelectInvertPanelsCommand.java 
 * Copyright (C) 2019 Daniel H. Huson
 *
 * (Some files contain contributions from other authors, who are then mentioned separately.)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package dendroscope.commands.select;

import jloda.swing.commands.CommandBase;
import jloda.swing.commands.ICommand;
import jloda.util.parse.NexusStreamParser;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * invert the selection of panels
 * Daniel Huson, 5.2010
 */
public class SelectInvertPanelsCommand extends CommandBase implements ICommand {
    /**
     * get the name to be used as a menu label
     *
     * @return name
     */

    public String getName() {
        return "Invert Panels";
    }

    /**
     * get description to be used as a tool tip
     *
     * @return description
     */

    public String getDescription() {
        return "Invert the selection of all panels";
    }

    /**
     * get icon to be used in menu or button
     *
     * @return icon
     */

    public ImageIcon getIcon() {
        return null;
    }

    /**
     * gets the accelerator key  to be used in menu
     *
     * @return accelerator key
     */

    public KeyStroke getAcceleratorKey() {
        return null;
    }

    /**
     * parses the given command and executes it
     *
     * @param np
     * @throws java.io.IOException
     */

    public void apply(NexusStreamParser np) throws Exception {
    }

    /**
     * action to be performed
     *
     * @param ev
     */

    public void actionPerformed(ActionEvent ev) {
        execute("select panels=invert;");
    }

    /**
     * get command-line usage description
     *
     * @return usage
     */

    public String getSyntax() {
        return null;
    }

    /**
     * is this a critical command that can only be executed when no other command is running?
     *
     * @return true, if critical
     */
    @Override
    public boolean isCritical() {
        return true;
    }

    /**
     * is the command currently applicable? Used to set enable state of command
     *
     * @return true, if command can be applied
     */
    @Override
    public boolean isApplicable() {
        return true;
    }
}
