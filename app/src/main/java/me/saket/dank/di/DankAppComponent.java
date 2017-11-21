package me.saket.dank.di;

import com.danikula.videocache.HttpProxyCacheServer;
import com.squareup.moshi.Moshi;

import javax.inject.Singleton;

import dagger.Component;
import me.saket.dank.DatabaseCacheRecyclerJobService;
import me.saket.dank.data.DankRedditClient;
import me.saket.dank.data.ErrorResolver;
import me.saket.dank.data.InboxManager;
import me.saket.dank.data.SharedPrefsManager;
import me.saket.dank.data.SubredditSubscriptionManager;
import me.saket.dank.data.UserPreferences;
import me.saket.dank.data.VotingManager;
import me.saket.dank.notifs.MediaDownloadService;
import me.saket.dank.notifs.MessagesNotificationManager;
import me.saket.dank.ui.compose.ComposeReplyActivity;
import me.saket.dank.ui.compose.UploadImageDialog;
import me.saket.dank.ui.giphy.GiphyPickerActivity;
import me.saket.dank.ui.media.MediaAlbumViewerActivity;
import me.saket.dank.ui.media.MediaImageFragment;
import me.saket.dank.ui.media.MediaVideoFragment;
import me.saket.dank.ui.preferences.HiddenPreferencesActivity;
import me.saket.dank.ui.submission.RetryReplyJobService;
import me.saket.dank.ui.submission.SubmissionFragment;
import me.saket.dank.ui.subreddits.SubredditActivity;
import me.saket.dank.ui.subreddits.SubredditPickerSheetView;
import me.saket.dank.ui.subreddits.SubredditSubscriptionsSyncJob;
import me.saket.dank.ui.user.UserProfilePopup;
import me.saket.dank.ui.user.UserSession;
import me.saket.dank.ui.user.messages.InboxActivity;
import me.saket.dank.ui.user.messages.PrivateMessageThreadActivity;
import me.saket.dank.utils.JacksonHelper;

@Component(modules = DankAppModule.class)
@Singleton
public interface DankAppComponent {
  DankRedditClient dankRedditClient();

  SharedPrefsManager sharedPrefs();

  HttpProxyCacheServer httpProxyCacheServer();

  DankApi api();

  UserPreferences userPrefs();

  SubredditSubscriptionManager subredditSubscriptionManager();

  JacksonHelper jacksonHelper();

  ErrorResolver errorManager();

  InboxManager inboxManager();

  MessagesNotificationManager messagesNotificationManager();

  Moshi moshi();

  VotingManager votingManager();

  UserSession userSession();

  void inject(MediaAlbumViewerActivity activity);

  void inject(MediaVideoFragment fragment);

  void inject(SubmissionFragment fragment);

  void inject(MediaDownloadService service);

  void inject(MediaImageFragment fragment);

  void inject(InboxActivity activity);

  void inject(PrivateMessageThreadActivity activity);

  void inject(UserProfilePopup popup);

  void inject(HiddenPreferencesActivity activity);

  void inject(SubredditActivity activity);

  void inject(SubredditSubscriptionsSyncJob service);

  void inject(SubredditPickerSheetView view);

  void inject(DatabaseCacheRecyclerJobService service);

  void inject(UploadImageDialog dialog);

  void inject(GiphyPickerActivity activity);

  void inject(RetryReplyJobService service);

  void inject(ComposeReplyActivity activity);
}
