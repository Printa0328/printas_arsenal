#version 330

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in vec3 Normal;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

out vec2 texCoord0;
out vec3 normal;
out vec3 fragPos;
out vec3 viewDir;

uniform vec3 CameraPos;

void main() {
    // 월드 좌표 (fragPos 계산용)
    vec4 worldPos = ModelViewMat * vec4(Position, 1.0);

    // 기본 출력
    gl_Position = ProjMat * worldPos;

    // 전달용 변수 세팅
    texCoord0 = UV0;
    normal = normalize((ModelViewMat * vec4(Normal, 0.0)).xyz);
    fragPos = worldPos.xyz;
    viewDir = normalize(CameraPos - fragPos);
}
