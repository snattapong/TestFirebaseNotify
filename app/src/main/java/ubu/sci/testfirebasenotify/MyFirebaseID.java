package ubu.sci.testfirebasenotify;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseID extends FirebaseInstanceIdService {
    private static final String LOGTAG = "MyFirebaseID" ;

    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(LOGTAG, "Refreshed token: " + refreshedToken);
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
        Log.d(LOGTAG,"sendReistationToServer... Leave it here");
    }
}
