package com.orcasiq.OrcasIQ.service;

import com.orcasiq.OrcasIQ.model.SubscribeForm;

public interface SubscribeFormService {
    SubscribeForm saveSubscription(SubscribeForm form);
    void sendSubscriptionEmail(SubscribeForm form);
}
