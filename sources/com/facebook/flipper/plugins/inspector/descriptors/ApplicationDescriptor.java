package com.facebook.flipper.plugins.inspector.descriptors;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.flipper.core.ErrorReportingRunnable;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.ApplicationWrapper;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import com.facebook.flipper.plugins.inspector.descriptors.utils.ContextDescriptorUtils;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ApplicationDescriptor extends NodeDescriptor<ApplicationWrapper> {
    private static final List<ViewGroup> editedDelegates = new ArrayList();
    private static boolean searchActive;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class NodeKey {
        private int[] mKey;

        private NodeKey() {
        }

        boolean set(ApplicationWrapper applicationWrapper) {
            List<View> viewRoots = applicationWrapper.getViewRoots();
            int size = viewRoots.size();
            int[] iArr = new int[size];
            boolean z = false;
            for (int i = 0; i < size; i++) {
                iArr[i] = System.identityHashCode(viewRoots.get(i));
            }
            int[] iArr2 = this.mKey;
            if (iArr2 != null && iArr2.length == size) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.mKey[i2] == iArr[i2]) {
                    }
                }
                this.mKey = iArr;
                return z;
            }
            z = true;
            this.mKey = iArr;
            return z;
        }
    }

    public static void clearEditedDelegates() {
        for (ViewGroup viewGroup : editedDelegates) {
            viewGroup.setAccessibilityDelegate(null);
        }
        editedDelegates.clear();
    }

    public static boolean getSearchActive() {
        return searchActive;
    }

    private void runHitTest(ApplicationWrapper applicationWrapper, Touch touch, boolean z) {
        Object childAt;
        for (int childCount = getChildCount(applicationWrapper) - 1; childCount >= 0; childCount--) {
            if (z) {
                childAt = getAXChildAt(applicationWrapper, childCount);
            } else {
                childAt = getChildAt(applicationWrapper, childCount);
            }
            if ((childAt instanceof Activity) || (childAt instanceof ViewGroup)) {
                touch.continueWithOffset(childCount, 0, 0);
                return;
            }
        }
        touch.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelegates(ApplicationWrapper applicationWrapper) {
        clearEditedDelegates();
        for (View view : applicationWrapper.getViewRoots()) {
            boolean S = syb.S(view);
            if ((view instanceof ViewGroup) && !S) {
                view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.facebook.flipper.plugins.inspector.descriptors.ApplicationDescriptor.1
                    @Override // android.view.View.AccessibilityDelegate
                    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view2, AccessibilityEvent accessibilityEvent) {
                        if (((NodeDescriptor) ApplicationDescriptor.this).mConnection != null) {
                            if (ApplicationDescriptor.searchActive) {
                                return false;
                            }
                            int eventType = accessibilityEvent.getEventType();
                            if (eventType == 32768) {
                                ((NodeDescriptor) ApplicationDescriptor.this).mConnection.send("axFocusEvent", new FlipperObject.Builder().put("isFocus", Boolean.TRUE).build());
                            } else if (eventType == 65536) {
                                ((NodeDescriptor) ApplicationDescriptor.this).mConnection.send("axFocusEvent", new FlipperObject.Builder().put("isFocus", Boolean.FALSE).build());
                            } else if (eventType == 1) {
                                ((NodeDescriptor) ApplicationDescriptor.this).mConnection.send("axFocusEvent", new FlipperObject.Builder().put("isFocus", Boolean.FALSE).put("isClick", Boolean.TRUE).build());
                            }
                        }
                        return super.onRequestSendAccessibilityEvent(viewGroup, view2, accessibilityEvent);
                    }
                });
                editedDelegates.add((ViewGroup) view);
            } else if (S && this.mConnection != null) {
                this.mConnection.send("track", new FlipperObject.Builder().put(MessageAttributes.TYPE, "usage").put("eventName", "accessibility:hasDelegateAlready").build());
            }
        }
    }

    public static void setSearchActive(boolean z) {
        searchActive = z;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXName(ApplicationWrapper applicationWrapper) {
        return "Application";
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(ApplicationWrapper applicationWrapper) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(ApplicationWrapper applicationWrapper, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void axHitTest(ApplicationWrapper applicationWrapper, Touch touch) throws Exception {
        runHitTest(applicationWrapper, touch, true);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getAXChildAt(ApplicationWrapper applicationWrapper, int i) {
        return applicationWrapper.getViewRoots().get(i);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(ApplicationWrapper applicationWrapper) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(ApplicationWrapper applicationWrapper, int i) {
        View view = applicationWrapper.getViewRoots().get(i);
        for (Activity activity : applicationWrapper.getActivityStack()) {
            if (activity.getWindow().getDecorView() == view) {
                return activity;
            }
        }
        return view;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(ApplicationWrapper applicationWrapper) {
        return applicationWrapper.getViewRoots().size();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(ApplicationWrapper applicationWrapper) {
        return Collections.singletonList(new Named("Theme", ContextDescriptorUtils.themeData(applicationWrapper.getApplication())));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(ApplicationWrapper applicationWrapper) {
        return new FlipperObject.Builder().put("linkedNode", getId(applicationWrapper)).build();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(ApplicationWrapper applicationWrapper) {
        return applicationWrapper.getApplication().getPackageName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(ApplicationWrapper applicationWrapper) {
        return applicationWrapper.getApplication().getPackageName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(ApplicationWrapper applicationWrapper, boolean z) throws Exception {
        int childCount = getChildCount(applicationWrapper);
        if (childCount > 0) {
            Object childAt = getChildAt(applicationWrapper, childCount - 1);
            NodeDescriptor<?> descriptorForClass = descriptorForClass(childAt.getClass());
            if (descriptorForClass != null) {
                return descriptorForClass.getSnapshot(childAt, z);
            }
            return null;
        }
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(ApplicationWrapper applicationWrapper, Touch touch) throws Exception {
        runHitTest(applicationWrapper, touch, false);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(final ApplicationWrapper applicationWrapper) {
        applicationWrapper.setListener(new ApplicationWrapper.ActivityStackChangedListener() { // from class: com.facebook.flipper.plugins.inspector.descriptors.ApplicationDescriptor.2
            @Override // com.facebook.flipper.plugins.inspector.ApplicationWrapper.ActivityStackChangedListener
            public void onActivityStackChanged(List<Activity> list) {
                ApplicationDescriptor.this.invalidate(applicationWrapper);
                ApplicationDescriptor.this.invalidateAX(applicationWrapper);
                ApplicationDescriptor.this.setDelegates(applicationWrapper);
            }
        });
        final NodeKey nodeKey = new NodeKey();
        FlipperConnection flipperConnection = this.mConnection;
        if (flipperConnection != null) {
            applicationWrapper.postDelayed(new ErrorReportingRunnable(flipperConnection) { // from class: com.facebook.flipper.plugins.inspector.descriptors.ApplicationDescriptor.3
                @Override // com.facebook.flipper.core.ErrorReportingRunnable
                public void runOrThrow() {
                    if (ApplicationDescriptor.this.connected()) {
                        if (nodeKey.set(applicationWrapper)) {
                            ApplicationDescriptor.this.invalidate(applicationWrapper);
                            ApplicationDescriptor.this.invalidateAX(applicationWrapper);
                            ApplicationDescriptor.this.setDelegates(applicationWrapper);
                        }
                        applicationWrapper.postDelayed(this, 1000L);
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, ApplicationWrapper applicationWrapper) throws Exception {
        return descriptorForClass(Object.class).matches(str, applicationWrapper);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(ApplicationWrapper applicationWrapper, boolean z, boolean z2) throws Exception {
        int childCount = getChildCount(applicationWrapper);
        if (childCount > 0) {
            Object childAt = getChildAt(applicationWrapper, childCount - 1);
            NodeDescriptor<?> descriptorForClass = descriptorForClass(childAt.getClass());
            if (descriptorForClass != null) {
                descriptorForClass.setHighlighted(childAt, z, z2);
            }
        }
    }
}
