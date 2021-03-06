package com.ontometrics.integrations.configuration;

import com.ontometrics.integrations.events.Issue;

import java.net.URL;

/**
 * Created by rob on 8/19/14.
 * Copyright (c) ontometrics, 2014 All Rights Reserved
 */
public interface IssueTracker {

    URL getBaseUrl();

    URL getFeedUrl();

    URL getChangesUrl(Issue issue);

    URL getAttachmentsUrl(Issue issue);

}
