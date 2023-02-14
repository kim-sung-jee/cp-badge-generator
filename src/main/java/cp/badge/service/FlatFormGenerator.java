package cp.badge.service;

import cp.badge.flatform.FlatForm;

public interface FlatFormGenerator {
    FlatForm getFlatFormFromHandle(String handle);
}
