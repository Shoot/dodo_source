package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.flipper.core.FlipperSocket;
import com.huawei.hms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements sb1 {
    static final o B5;
    private Rect A;
    private TextWatcher A5;
    private int[] B;
    private int[] I;
    private final ImageView S4;
    private final Drawable T4;
    private final int U4;
    private final int V4;
    private final Intent W4;
    private final Intent X4;
    private final CharSequence Y4;
    private m Z4;
    private l a5;
    View.OnFocusChangeListener b5;
    private View.OnClickListener c5;
    private boolean d5;
    private boolean e5;
    l32 f5;
    private boolean g5;
    private CharSequence h5;
    private boolean i5;
    private boolean j5;
    private int k5;
    private boolean l5;
    private CharSequence m5;
    private CharSequence n5;
    private boolean o5;
    final SearchAutoComplete p;
    private int p5;
    private final View q;
    SearchableInfo q5;
    private final View r;
    private Bundle r5;
    private final View s;
    private final Runnable s5;
    final ImageView t;
    private Runnable t5;
    final ImageView u;
    private final WeakHashMap<String, Drawable.ConstantState> u5;
    final ImageView v;
    private final View.OnClickListener v5;
    final ImageView w;
    View.OnKeyListener w5;
    private final View x;
    private final TextView.OnEditorActionListener x5;
    private p y;
    private final AdapterView.OnItemClickListener y5;
    private Rect z;
    private final AdapterView.OnItemSelectedListener z5;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {
        private int e;
        private SearchView f;
        private boolean g;
        final Runnable h;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, aw8.q);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return SyslogConstants.LOG_LOCAL4;
                }
                return 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.B5.c(this);
        }

        boolean c() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        void d() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.g = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l32 l32Var = SearchView.this.f5;
            if (l32Var instanceof z) {
                l32Var.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.b5;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.B();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.t) {
                searchView.V();
            } else if (view == searchView.v) {
                searchView.R();
            } else if (view == searchView.u) {
                searchView.W();
            } else if (view == searchView.w) {
                searchView.a0();
            } else if (view == searchView.p) {
                searchView.H();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.q5 == null) {
                return false;
            }
            if (searchView.p.isPopupShowing() && SearchView.this.p.getListSelection() != -1) {
                return SearchView.this.X(view, i, keyEvent);
            }
            if (SearchView.this.p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.p.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.S(i, 0, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean onClose();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {
        private Method a;
        private Method b;
        private Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() {
            this.a = null;
            this.b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class p extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (z && !this.c.contains(x, y)) {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            } else {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        B5 = oVar;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.n5);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.r5;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.q5.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i2, String str) {
        int i3;
        Uri parse;
        String o2;
        try {
            String o3 = z.o(cursor, "suggest_intent_action");
            if (o3 == null) {
                o3 = this.q5.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = "android.intent.action.SEARCH";
            }
            String str2 = o3;
            String o4 = z.o(cursor, "suggest_intent_data");
            if (o4 == null) {
                o4 = this.q5.getSuggestIntentData();
            }
            if (o4 != null && (o2 = z.o(cursor, "suggest_intent_data_id")) != null) {
                o4 = o4 + "/" + Uri.encode(o2);
            }
            if (o4 == null) {
                parse = null;
            } else {
                parse = Uri.parse(o4);
            }
            return C(str2, parse, z.o(cursor, "suggest_intent_extra_data"), z.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i2;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.r5;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        } else {
            i2 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    private void G() {
        this.p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.I);
        int[] iArr = this.B;
        int i2 = iArr[1];
        int[] iArr2 = this.I;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence J(CharSequence charSequence) {
        if (this.d5 && this.T4 != null) {
            int textSize = (int) (this.p.getTextSize() * 1.25d);
            this.T4.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.T4), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    private boolean K() {
        Intent intent;
        SearchableInfo searchableInfo = this.q5;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.q5.getVoiceSearchLaunchWebSearch()) {
            intent = this.W4;
        } else if (this.q5.getVoiceSearchLaunchRecognizer()) {
            intent = this.X4;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private boolean N() {
        if ((this.g5 || this.l5) && !L()) {
            return true;
        }
        return false;
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private boolean Q(int i2, int i3, String str) {
        Cursor d2 = this.f5.d();
        if (d2 != null && d2.moveToPosition(i2)) {
            O(D(d2, i3, str));
            return true;
        }
        return false;
    }

    private void b0() {
        post(this.s5);
    }

    private void c0(int i2) {
        Editable text = this.p.getText();
        Cursor d2 = this.f5.d();
        if (d2 == null) {
            return;
        }
        if (d2.moveToPosition(i2)) {
            CharSequence b2 = this.f5.b(d2);
            if (b2 != null) {
                setQuery(b2);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private void e0() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        int i2 = 0;
        if (!z2 && (!this.d5 || this.o5)) {
            z = false;
        }
        ImageView imageView = this.v;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.v.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(xw8.g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(xw8.h);
    }

    private void h0() {
        this.p.setThreshold(this.q5.getSuggestThreshold());
        this.p.setImeOptions(this.q5.getImeOptions());
        int inputType = this.q5.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.q5.getSuggestAuthority() != null) {
                inputType |= FlipperSocket.SOCKET_TAG;
            }
        }
        this.p.setInputType(inputType);
        l32 l32Var = this.f5;
        if (l32Var != null) {
            l32Var.a(null);
        }
        if (this.q5.getSuggestAuthority() != null) {
            z zVar = new z(getContext(), this, this.q5, this.u5);
            this.f5 = zVar;
            this.p.setAdapter(zVar);
            z zVar2 = (z) this.f5;
            if (this.i5) {
                i2 = 2;
            }
            zVar2.x(i2);
        }
    }

    private void i0() {
        int i2;
        if (N() && (this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.s.setVisibility(i2);
    }

    private void j0(boolean z) {
        int i2;
        if (this.g5 && N() && hasFocus() && (z || !this.l5)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.u.setVisibility(i2);
    }

    private void k0(boolean z) {
        int i2;
        int i3;
        this.e5 = z;
        int i4 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i2);
        j0(!isEmpty);
        View view = this.q;
        if (z) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        if (this.S4.getDrawable() != null && !this.d5) {
            i4 = 0;
        }
        this.S4.setVisibility(i4);
        e0();
        l0(isEmpty);
        i0();
    }

    private void l0(boolean z) {
        int i2 = 8;
        if (this.l5 && !L() && z) {
            this.u.setVisibility(8);
            i2 = 0;
        }
        this.w.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.p.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.p;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    void B() {
        int i2;
        int i3;
        if (this.x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = b1c.b(this);
            if (this.d5) {
                i2 = resources.getDimensionPixelSize(xw8.e) + resources.getDimensionPixelSize(xw8.f);
            } else {
                i2 = 0;
            }
            this.p.getDropDownBackground().getPadding(rect);
            if (b2) {
                i3 = -rect.left;
            } else {
                i3 = paddingLeft - (rect.left + i2);
            }
            this.p.setDropDownHorizontalOffset(i3);
            this.p.setDropDownWidth((((this.x.getWidth() + rect.left) + rect.right) + i2) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.p);
            return;
        }
        o oVar = B5;
        oVar.b(this.p);
        oVar.a(this.p);
    }

    public boolean L() {
        return this.e5;
    }

    void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void R() {
        if (TextUtils.isEmpty(this.p.getText())) {
            if (this.d5) {
                l lVar = this.a5;
                if (lVar == null || !lVar.onClose()) {
                    clearFocus();
                    k0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.p.setText("");
        this.p.requestFocus();
        this.p.setImeVisibility(true);
    }

    boolean S(int i2, int i3, String str) {
        Q(i2, 0, null);
        this.p.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i2) {
        c0(i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.c5;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.Z4;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.q5 != null) {
                    P(0, null, text.toString());
                }
                this.p.setImeVisibility(false);
                G();
            }
        }
    }

    boolean X(View view, int i2, KeyEvent keyEvent) {
        int length;
        if (this.q5 != null && this.f5 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 != 66 && i2 != 84 && i2 != 61) {
                if (i2 != 21 && i2 != 22) {
                    if (i2 == 19) {
                        this.p.getListSelection();
                        return false;
                    }
                } else {
                    if (i2 == 21) {
                        length = 0;
                    } else {
                        length = this.p.length();
                    }
                    this.p.setSelection(length);
                    this.p.setListSelection(0);
                    this.p.clearListSelection();
                    this.p.b();
                    return true;
                }
            } else {
                return S(this.p.getListSelection(), 0, null);
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.p.getText();
        this.n5 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        if (this.Z4 != null && !TextUtils.equals(charSequence, this.m5)) {
            this.Z4.a(charSequence.toString());
        }
        this.m5 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.p.hasFocus()) {
            H();
        }
    }

    @Override // defpackage.sb1
    public void a() {
        if (this.o5) {
            return;
        }
        this.o5 = true;
        int imeOptions = this.p.getImeOptions();
        this.p5 = imeOptions;
        this.p.setImeOptions(imeOptions | 33554432);
        this.p.setText("");
        setIconified(false);
    }

    void a0() {
        SearchableInfo searchableInfo = this.q5;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.W4, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.X4, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // defpackage.sb1
    public void b() {
        d0("", false);
        clearFocus();
        k0(true);
        this.p.setImeOptions(this.p5);
        this.o5 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.j5 = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.j5 = false;
    }

    public void d0(CharSequence charSequence, boolean z) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.n5 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    void f0() {
        int[] iArr;
        if (this.p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.k5;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.h5;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.q5;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.q5.getHintId());
            }
            return this.Y4;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.V4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.U4;
    }

    public l32 getSuggestionsAdapter() {
        return this.f5;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.s5);
        post(this.t5);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            I(this.p, this.z);
            Rect rect = this.A;
            Rect rect2 = this.z;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.y;
            if (pVar == null) {
                p pVar2 = new p(this.A, this.z, this.p);
                this.y = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.A, this.z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i4 = this.k5) > 0) {
                    size = Math.min(i4, size);
                }
            } else {
                size = this.k5;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i5 = this.k5;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        k0(savedState.c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = L();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.j5 || !isFocusable()) {
            return false;
        }
        if (!L()) {
            boolean requestFocus = this.p.requestFocus(i2, rect);
            if (requestFocus) {
                k0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i2, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.r5 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.d5 == z) {
            return;
        }
        this.d5 = z;
        k0(z);
        g0();
    }

    public void setImeOptions(int i2) {
        this.p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.k5 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.a5 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.b5 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.Z4 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.c5 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.h5 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i2;
        this.i5 = z;
        l32 l32Var = this.f5;
        if (l32Var instanceof z) {
            z zVar = (z) l32Var;
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            zVar.x(i2);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.q5 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.l5 = K;
        if (K) {
            this.p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.g5 = z;
        k0(L());
    }

    public void setSuggestionsAdapter(l32 l32Var) {
        this.f5 = l32Var;
        this.p.setAdapter(l32Var);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aw8.L);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.I = new int[2];
        this.s5 = new b();
        this.t5 = new c();
        this.u5 = new WeakHashMap<>();
        f fVar = new f();
        this.v5 = fVar;
        this.w5 = new g();
        h hVar = new h();
        this.x5 = hVar;
        i iVar = new i();
        this.y5 = iVar;
        j jVar = new j();
        this.z5 = jVar;
        this.A5 = new a();
        int[] iArr = n29.h2;
        e0 v = e0.v(context, attributeSet, iArr, i2, 0);
        syb.s0(this, context, iArr, attributeSet, v.r(), i2, 0);
        LayoutInflater.from(context).inflate(v.n(n29.r2, xz8.t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(ay8.J);
        this.p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(ay8.F);
        View findViewById = findViewById(ay8.I);
        this.r = findViewById;
        View findViewById2 = findViewById(ay8.P);
        this.s = findViewById2;
        ImageView imageView = (ImageView) findViewById(ay8.D);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(ay8.G);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(ay8.E);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(ay8.K);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(ay8.H);
        this.S4 = imageView5;
        syb.y0(findViewById, v.g(n29.s2));
        syb.y0(findViewById2, v.g(n29.w2));
        int i3 = n29.v2;
        imageView.setImageDrawable(v.g(i3));
        imageView2.setImageDrawable(v.g(n29.p2));
        imageView3.setImageDrawable(v.g(n29.m2));
        imageView4.setImageDrawable(v.g(n29.y2));
        imageView5.setImageDrawable(v.g(i3));
        this.T4 = v.g(n29.u2);
        yib.a(imageView, getResources().getString(h19.p));
        this.U4 = v.n(n29.x2, xz8.s);
        this.V4 = v.n(n29.n2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.A5);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.w5);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v.a(n29.q2, true));
        int f2 = v.f(n29.j2, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.Y4 = v.p(n29.o2);
        this.h5 = v.p(n29.t2);
        int k2 = v.k(n29.l2, -1);
        if (k2 != -1) {
            setImeOptions(k2);
        }
        int k3 = v.k(n29.k2, -1);
        if (k3 != -1) {
            setInputType(k3);
        }
        setFocusable(v.a(n29.i2, true));
        v.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.W4 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.X4 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.d5);
        g0();
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.Y(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
