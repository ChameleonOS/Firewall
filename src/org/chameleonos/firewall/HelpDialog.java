/**
 * Dialog displayed when the "Help" menu option is selected
 * 
 * Copyright (C) 2009-2011  Rodrigo Zechin Rosauro
 * Copyright (C) 2012-2014	Jason Tschohl
 * Copyright (C) 2013 The ChameleonOS Project
 *
 * This program is free sftware: you can redistribute it and/or modify
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
 *
 * @author Rodrigo Zechin Rosauro
 * @author Jason Tschohl
 * @version 1.0
 */
package org.chameleonos.firewall;

import org.chameleonos.firewall.R;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

/**
 * Dialog displayed when the "Help" menu option is selected
 */
public class HelpDialog extends AlertDialog {
	@SuppressWarnings("deprecation")
	protected HelpDialog(Context context) {
		super(context);
		final View view = getLayoutInflater().inflate(R.layout.help_dialog,
				null);
		setButton(context.getText(R.string.close), (OnClickListener) null);
		setIcon(R.drawable.icon);
		setTitle("Android Firewall");
		setView(view);
	}
}