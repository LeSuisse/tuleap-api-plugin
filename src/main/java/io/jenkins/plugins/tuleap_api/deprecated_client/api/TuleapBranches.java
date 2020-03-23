package io.jenkins.plugins.tuleap_api.deprecated_client.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TuleapBranches {
    private String name;
    private TuleapCommit commit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TuleapCommit getCommit() {
        return commit;
    }

    public void setCommit(TuleapCommit commit) {
        this.commit = commit;
    }
}
