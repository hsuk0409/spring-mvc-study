package com.mvc.choinsuk.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static final Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {
    }

    public Member save(Member member) {
        member.updateId(++sequence);
        store.put(member.getId(), member);

        return member;
    }

    public Member findById(Long userId) {
        return store.get(userId);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
