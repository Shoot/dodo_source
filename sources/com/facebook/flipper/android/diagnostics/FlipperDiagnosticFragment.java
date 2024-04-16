package com.facebook.flipper.android.diagnostics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import com.facebook.flipper.android.AndroidFlipperClient;
import com.facebook.flipper.core.FlipperClient;
import com.facebook.flipper.core.FlipperStateUpdateListener;
import com.facebook.flipper.core.StateSummary;
/* loaded from: classes2.dex */
public class FlipperDiagnosticFragment extends Fragment implements FlipperStateUpdateListener {
    FlipperDiagnosticSummaryTextFilter mDiagnosticSummaryTextFilter;
    TextView mLogView;
    private final View.OnClickListener mOnBugReportClickListener = new View.OnClickListener() { // from class: com.facebook.flipper.android.diagnostics.FlipperDiagnosticFragment.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FlipperDiagnosticFragment flipperDiagnosticFragment = FlipperDiagnosticFragment.this;
            flipperDiagnosticFragment.mReportCallback.report(AndroidFlipperClient.getInstance(flipperDiagnosticFragment.getContext()).getState(), FlipperDiagnosticFragment.this.getSummary().toString());
        }
    };
    Button mReportButton;
    FlipperDiagnosticReportListener mReportCallback;
    ScrollView mScrollView;
    TextView mSummaryView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.flipper.android.diagnostics.FlipperDiagnosticFragment$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$flipper$core$StateSummary$State;

        static {
            int[] iArr = new int[StateSummary.State.values().length];
            $SwitchMap$com$facebook$flipper$core$StateSummary$State = iArr;
            try {
                iArr[StateSummary.State.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$flipper$core$StateSummary$State[StateSummary.State.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$flipper$core$StateSummary$State[StateSummary.State.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$flipper$core$StateSummary$State[StateSummary.State.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static FlipperDiagnosticFragment newInstance() {
        return new FlipperDiagnosticFragment();
    }

    CharSequence getSummary() {
        String str;
        StateSummary stateSummary = AndroidFlipperClient.getInstance(getContext()).getStateSummary();
        StringBuilder sb = new StringBuilder(16);
        for (StateSummary.StateElement stateElement : stateSummary.mList) {
            int i = AnonymousClass3.$SwitchMap$com$facebook$flipper$core$StateSummary$State[stateElement.getState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "❓";
                    } else {
                        str = "❌";
                    }
                } else {
                    str = "✅";
                }
            } else {
                str = "⏳";
            }
            sb.append(str);
            sb.append(stateElement.getName());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FlipperDiagnosticReportListener) {
            this.mReportCallback = (FlipperDiagnosticReportListener) context;
        }
        if (context instanceof FlipperDiagnosticSummaryTextFilter) {
            this.mDiagnosticSummaryTextFilter = (FlipperDiagnosticSummaryTextFilter) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (this.mReportCallback != null) {
            Button button = new Button(getContext());
            this.mReportButton = button;
            button.setText("Report Bug");
            this.mReportButton.setOnClickListener(this.mOnBugReportClickListener);
        }
        this.mSummaryView = new TextView(getContext());
        this.mLogView = new TextView(getContext());
        ScrollView scrollView = new ScrollView(getContext());
        this.mScrollView = scrollView;
        scrollView.addView(this.mLogView);
        Button button2 = this.mReportButton;
        if (button2 != null) {
            linearLayout.addView(button2);
        }
        linearLayout.addView(this.mSummaryView);
        linearLayout.addView(this.mScrollView);
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mScrollView.fullScroll(130);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FlipperClient androidFlipperClient = AndroidFlipperClient.getInstance(getContext());
        androidFlipperClient.subscribeForUpdates(this);
        this.mSummaryView.setText(getSummary());
        this.mLogView.setText(androidFlipperClient.getState());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        AndroidFlipperClient.getInstance(getContext()).unsubscribe();
    }

    @Override // com.facebook.flipper.core.FlipperStateUpdateListener
    public void onUpdate() {
        final CharSequence applyDiagnosticSummaryTextFilter;
        final String state = AndroidFlipperClient.getInstance(getContext()).getState();
        FlipperDiagnosticSummaryTextFilter flipperDiagnosticSummaryTextFilter = this.mDiagnosticSummaryTextFilter;
        if (flipperDiagnosticSummaryTextFilter == null) {
            applyDiagnosticSummaryTextFilter = getSummary();
        } else {
            applyDiagnosticSummaryTextFilter = flipperDiagnosticSummaryTextFilter.applyDiagnosticSummaryTextFilter(getSummary());
        }
        d activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.facebook.flipper.android.diagnostics.FlipperDiagnosticFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    FlipperDiagnosticFragment.this.mSummaryView.setText(applyDiagnosticSummaryTextFilter);
                    FlipperDiagnosticFragment.this.mLogView.setText(state);
                    FlipperDiagnosticFragment.this.mScrollView.fullScroll(130);
                }
            });
        }
    }
}
