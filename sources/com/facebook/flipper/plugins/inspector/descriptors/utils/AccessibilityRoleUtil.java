package com.facebook.flipper.plugins.inspector.descriptors.utils;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.d4;
/* loaded from: classes2.dex */
public class AccessibilityRoleUtil {

    /* loaded from: classes2.dex */
    public enum AccessibilityRole {
        NONE(null, ""),
        BUTTON("android.widget.Button", "Button"),
        CHECK_BOX("android.widget.CompoundButton", "Check box"),
        DROP_DOWN_LIST("android.widget.Spinner", "Drop down list"),
        EDIT_TEXT("android.widget.EditText", "Edit box"),
        GRID("android.widget.GridView", "Grid"),
        IMAGE("android.widget.ImageView", "Image"),
        IMAGE_BUTTON("android.widget.ImageView", "Button"),
        LIST("android.widget.AbsListView", "List"),
        PAGER("androidx.viewpager.widget.ViewPager", "Multi-page view"),
        RADIO_BUTTON("android.widget.RadioButton", "Radio button"),
        SEEK_CONTROL("android.widget.SeekBar", "Seek control"),
        SWITCH("android.widget.Switch", "Switch"),
        TAB_BAR("android.widget.TabWidget", "Tab bar"),
        TOGGLE_BUTTON("android.widget.ToggleButton", "Switch"),
        VIEW_GROUP("android.view.ViewGroup", ""),
        WEB_VIEW("android.webkit.WebView", "Webview"),
        CHECKED_TEXT_VIEW("android.widget.CheckedTextView", ""),
        PROGRESS_BAR("android.widget.ProgressBar", "Progress bar"),
        ACTION_BAR_TAB("android.app.ActionBar$Tab", ""),
        DRAWER_LAYOUT("androidx.drawerlayout.widget.DrawerLayout", ""),
        SLIDING_DRAWER("android.widget.SlidingDrawer", ""),
        ICON_MENU("com.android.internal.view.menu.IconMenuView", ""),
        TOAST("android.widget.Toast$TN", ""),
        DATE_PICKER_DIALOG("android.app.DatePickerDialog", ""),
        TIME_PICKER_DIALOG("android.app.TimePickerDialog", ""),
        DATE_PICKER("android.widget.DatePicker", ""),
        TIME_PICKER("android.widget.TimePicker", ""),
        NUMBER_PICKER("android.widget.NumberPicker", ""),
        SCROLL_VIEW("android.widget.ScrollView", ""),
        HORIZONTAL_SCROLL_VIEW("android.widget.HorizontalScrollView", ""),
        KEYBOARD_KEY("android.inputmethodservice.Keyboard$Key", "");
        
        private final String mRoleString;
        private final String mValue;

        AccessibilityRole(String str, String str2) {
            this.mValue = str;
            this.mRoleString = str2;
        }

        public static AccessibilityRole fromValue(String str) {
            AccessibilityRole[] values;
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.getValue() != null && accessibilityRole.getValue().equals(str)) {
                    return accessibilityRole;
                }
            }
            return NONE;
        }

        public String getRoleString() {
            return this.mRoleString;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    private AccessibilityRoleUtil() {
    }

    public static AccessibilityRole getRole(View view) {
        if (view == null) {
            return AccessibilityRole.NONE;
        }
        d4 Z = d4.Z();
        syb.h0(view, Z);
        AccessibilityRole role = getRole(Z);
        Z.d0();
        return role;
    }

    public static String getTalkbackRoleString(View view) {
        if (view == null) {
            return "";
        }
        return getRole(view).getRoleString();
    }

    public static AccessibilityRole getRole(AccessibilityNodeInfo accessibilityNodeInfo) {
        return getRole(new d4((Object) accessibilityNodeInfo));
    }

    public static AccessibilityRole getRole(d4 d4Var) {
        d4.b r;
        AccessibilityRole fromValue = AccessibilityRole.fromValue((String) d4Var.p());
        AccessibilityRole accessibilityRole = AccessibilityRole.IMAGE_BUTTON;
        if (fromValue.equals(accessibilityRole) || fromValue.equals(AccessibilityRole.IMAGE)) {
            return d4Var.I() ? accessibilityRole : AccessibilityRole.IMAGE;
        } else if (!fromValue.equals(AccessibilityRole.NONE) || (r = d4Var.r()) == null) {
            return fromValue;
        } else {
            if (r.b() > 1 && r.a() > 1) {
                return AccessibilityRole.GRID;
            }
            return AccessibilityRole.LIST;
        }
    }
}
