package cn.nodemedia;

public interface NodePublisherAudioRawDelegate {
    void onAudioRawCallback(NodePublisher streamer, int channels, byte[] data, int size);
}
