package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/approval")
@CrossOrigin
public class ApprovalController {

    @PostMapping("/start")
    public int startApproval(@RequestParam Long templateId, @RequestParam Long docId) {
        return 0;
    }

    @GetMapping("/my")
    public List<Approval> myApprovals() {
        return new LinkedList<Approval>();
    }

    @GetMapping("/toApprove")
    public List<Approval> toApprove() {
        return new LinkedList<Approval>();
    }

    @PostMapping("/approve")
    public int approve(@RequestBody ApproveState state) {
        return 0;
    }

    @GetMapping("/dummy")
    public int dummy() {
        return 0;
    }

}
